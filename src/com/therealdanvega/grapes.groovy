package com.therealdanvega

@Grapes(
        @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.4')
)

import org.apache.commons.lang3.text.WordUtils

String name = "Fabio Marques Moreira"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)