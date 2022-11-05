package com.example.listadoparques

class ParquesProvider {

    companion object{
        val listaparques = listOf<Parques>(

            Parques(
                titulo = "Parque de la Asomadilla",
                descripcion = "El parque de la Asomadilla es un parque urbano de España situado en el distrito Norte-Sierra de la ciudad de Córdoba.",
                foto = "https://4.bp.blogspot.com/-OHS8W4KJjT4/WN9kOUmVcbI/AAAAAAAAHQQ/e3sNiXOCZHwxJxSBNsGJSPF9EtiQ-YqfgCEw/s1600/IMG_3093.JPG"
            ),

            Parques(
                titulo = "Parque de la Merced",
                descripcion = "Conocidos también por Jardines de Colón, siempre tuvieron su referencia en el antiguo convento de frailes mercedarios.",
                foto = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/15/b0/8c/23/fontein-in-het-park.jpg?w=1200&h=-1&s=1"
            ),

            Parques(
                titulo = "Jardines de la Agricultura",
                descripcion = "Los jardines de la Agricultura, conocidos popularmente como «Los Patos» debido a la denominación del estanque central.",
                foto = "https://upload.wikimedia.org/wikipedia/commons/f/f1/Jardines_de_la_Agricultura.jpg"
            ),

            Parques(
                titulo = "Parque Juan Carlos I",
                descripcion = "Frente al actual Rectorado universitario se ubica uno de los parques más emblemáticos de la ciudad.",
                foto = "https://cdn.cityplan.es/admin/2015-04-09113649_thumbnail_1428318003.jpg"
            ),

            Parques(
                titulo = "Parque Cruz Conde",
                descripcion = "Parque Cruz Conde es un barrio de la ciudad de Córdoba, perteneciente al distrito Poniente Sur. Está situado en zona sur del distrito.",
                foto = "https://www.puedoviajar.es/documentos_web/puntos/3778/20150304_115938%20(Copy).jpg"
            )


        )
    }
}