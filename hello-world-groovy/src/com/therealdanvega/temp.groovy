// Verifica se existe UM envolvido ATRIBUÍDO é se o tipo envolvimento é SERVIDOR e se possui PERFIL_CHEFIA no Passaporte.
def envolvidos = tramite.envolvidoList.findAll { 
    //it.tipoEnvolvido.tipoEnvolvido == br.gov.go.tcm.processoeletronico.enums.TipoEnvolvido.SERVIDOR && 
    it.status == br.gov.go.tcm.modelo.Entidade.Status.ATIVO && 
    it.isAtribuido == true
}
def envolvidoOK = false;

if(envolvidos.size() == 1) {
    def envolvido = envolvidos.get(0);
    if(envolvido.isAtribuido) {
        if(envolvido.tipoEnvolvido.tipoEnvolvido == br.gov.go.tcm.processoeletronico.enums.TipoEnvolvido.SERVIDOR) {
            def chefe = TramiteDAO.isUsuarioPerfil(envolvido.usuario.id, Constantes.ID_PERFIL_PASSAPORTE_CHEFIA);
            if(chefe) {
                envolvidoOK = true;
            } else {
                util.adicionarMensagemErro("O SERVIDOR NÃO PODE SER INDICADO PORQUE NÃO POSSUI PERFIL DE CHEFIA.");
            }
        } else {
            util.adicionarMensagemErro("A CHEFIA INDICADA DEVE SER ADICIONADA COMO SERVIDOR E O PROCESSO DEVE SER ATRIBUÍDO A ELA.");
        }
        
    } else {
        util.adicionarMensagemErro("A CHEFIA INDICADA DEVE SER ADICIONADA COMO SERVIDOR E O PROCESSO DEVE SER ATRIBUÍDO A ELA.");
    }
} else {
    if(envolvidos.size() == 0) {
        util.adicionarMensagemErro("NENHUMA CHEFIA INDICADA, A CHEFIA INDICADA DEVE SER ADICIONADA COMO SERVIDOR E O PROCESSO DEVE SER ATRIBUÍDO A ELA.");
    } else {
        util.adicionarMensagemErro("O PROCESSO DEVE SER ATRIBUÍDO A APENAS UMA CHEFIA, A CHEFIA INDICADA DEVE SER ADICIONADA COMO SERVIDOR E O PROCESSO DEVE SER ATRIBUÍDO A ELA.");
    }
}

if(envolvidoOK) {
    tramite.resultadoTask = true;
} else {
    tramite.resultadoTask = false;
}