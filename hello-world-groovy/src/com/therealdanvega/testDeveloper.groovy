import com.therealdanvega.domain.Developer

Developer d = new Developer()
d.first = "Fabio"
d.setLast("Moreira")
//assign some languages
println d.languages.class
// '<<' push new object to array
d.languages << "Java"
d.languages << "Groovy"
println d
d.work()