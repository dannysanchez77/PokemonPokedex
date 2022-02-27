package com.example.poke


import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import javafx.stage.Stage
import java.io.File
import java.io.IOException


class ElegirPokemonController {
    var pokemonAmigo = ArrayList<Pokemon>()
    lateinit var elegirLuchador:Pokemon
    val pokemonAmigo1 = Pokemon("Groudon",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\groudon.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\groudon_espalda.gif"),
        "Groudon es el Pokémon Continente. Los Groudon son de tipo tierra y de color rojo.\n" +
                "A Groudon siempre se le ha descrito en mitología como el Pokémon que elevó la tierra y expandió los continentes. Tras un combate contra Kyogre que acabó en cataclismo, se echó a dormir.",
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\groudonPrimal.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fav.png")
    )
    val pokemonAmigo2 = Pokemon("Venusaur",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\venusaur.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\venu_espalda.gif"),
        "Venusaur es el Pokémon Semilla. Los Venusaur son de tipos planta veneno y de color verde.\n" +
                "Venusaur tiene una flor enorme en el lomo que, según parece, adquiere unos colores muy vivos si está bien nutrido y le da mucho el sol. " +
                "El aroma delicado de la flor tiene un efecto relajante en el ánimo de las personas." ,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\venusaurMega.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fav.png"))
    val pokemonAmigo3 = Pokemon("Torkoal",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\torkoal.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\torkoal_espalda.gif"),
        "Torkoal es el Pokémon Carbón. Los Torkoal son de tipo fuego y de color marrón.\n" +
                "Torkoal va cavando por las montañas en busca de carbón. " +
                "Cuando lo encuentra, rellena los huecos que tiene dentro del caparazón y lo quema." +
                " Si le atacan, este Pokémon echa un humo negro que le permite la retirada.",
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\ssss.png"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fav.png"))
    val pokemonAmigo4 = Pokemon("Electivire",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\electivire.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\elecEspalda.gif"),
        "Electivire es el Pokémon Rayo. Los Electivire son de tipo electrico y de color amarillo.\n" +
                "Toca a su enemigo con las puntas de sus dos colas y les suelta una descarga de más de 20000 voltios. " +
                "Ignora los ataques del enemigo y se acerca para clavarle las colas y darle una descarga de alto voltaje.",
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\ssss.png"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fav.png"))
    val pokemonAmigo5 = Pokemon("Sharpedo",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\sharpedo.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\sharpedo_espalda.gif"),
        "Sharpedo es el Pokémon Voraz. Los Sharpedo son de tipos agua siniestro y de color azul.\n" +
                "Conocido como ``el terror de los mares', Sharpedo es temido por todos. Si este Pokémon pierde las escalofriantes mandíbulas que tiene, las recupera en breve. Basta con un Sharpedo para destrozar un buque-cisterna.",
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\sharpedoMega.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fav.png"))
    val pokemonAmigo6 = Pokemon("Swampert",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert_espalda.gif"),
        "Swampert es el Pokémon Pez Lodo. Los Swampert son de tipos agua tierra y de color azul.\n" +
                "Swampert es muy fuerte. Puede arrastrar una roca que pese más de 1 tonelada sin ningún problema. Este Pokémon tiene el sentido de la vista muy desarrollado. Es capaz de ver hasta en aguas cenagosas.",
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampertMega.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fav.png"))




    @FXML private lateinit var fondo: ImageView
    @FXML private lateinit var pokemon00 : BorderPane
    @FXML private lateinit var pokemon10 : BorderPane
    @FXML private lateinit var pokemon20 : BorderPane
    @FXML private lateinit var pokemon01 : BorderPane
    @FXML private lateinit var pokemon11 : BorderPane
    @FXML private lateinit var pokemon21 : BorderPane

    @FXML private lateinit var Nombre00 : Label
    @FXML private lateinit var Nombre10 : Label
    @FXML private lateinit var Nombre20 : Label
    @FXML private lateinit var Nombre01 : Label
    @FXML private lateinit var Nombre11 : Label
    @FXML private lateinit var Nombre21 : Label

    @FXML private lateinit var Nv00 : Label
    @FXML private lateinit var Nv10 : Label
    @FXML private lateinit var Nv20 : Label
    @FXML private lateinit var Nv01 : Label
    @FXML private lateinit var Nv11 : Label
    @FXML private lateinit var Nv21 : Label

    @FXML private lateinit var foto00 : ImageView
    @FXML private lateinit var foto10 : ImageView
    @FXML private lateinit var foto20 : ImageView
    @FXML private lateinit var foto01 : ImageView
    @FXML private lateinit var foto11 : ImageView
    @FXML private lateinit var foto21 : ImageView

    @FXML private lateinit var genero00 : ImageView
    @FXML private lateinit var genero10 : ImageView
    @FXML private lateinit var genero20 : ImageView
    @FXML private lateinit var genero01 : ImageView
    @FXML private lateinit var genero11 : ImageView
    @FXML private lateinit var genero21 : ImageView

    @FXML private lateinit var vida00 : ProgressBar
    @FXML private lateinit var vida10 : ProgressBar
    @FXML private lateinit var vida20 : ProgressBar
    @FXML private lateinit var vida01 : ProgressBar
    @FXML private lateinit var vida11 : ProgressBar
    @FXML private lateinit var vida21 : ProgressBar

    @FXML private lateinit var Ps00 : Label
    @FXML private lateinit var Ps10 : Label
    @FXML private lateinit var Ps20 : Label
    @FXML private lateinit var Ps01 : Label
    @FXML private lateinit var Ps11 : Label
    @FXML private lateinit var Ps21 : Label

    @FXML private lateinit var fav00 : ImageView
    @FXML private lateinit var fav10 : ImageView
    @FXML private lateinit var fav20 : ImageView
    @FXML private lateinit var fav01 : ImageView
    @FXML private lateinit var fav11 : ImageView
    @FXML private lateinit var fav21 : ImageView

    @FXML private lateinit var elegir : Button
    @FXML private lateinit var Estadisticas : Button

    private fun calcularBarraVida(poke: Pokemon): Double{
        return poke.vidaActual.toDouble()/poke.vidaMaxima
    }
    fun configurarPoke(
        nombre: Label, nivel:Label, imagen: ImageView, genero:ImageView, vida:ProgressBar, ps:Label,
         favorito: ImageView ,poke:Pokemon,  ){
        nombre.text=poke.Nombre
        nivel.text="Nv "+poke.Nv
        imagen.image = Image(poke.imagen.toURI().toString())
        genero.image= Image(poke.genero.toURI().toString())
        vida.progress = calcularBarraVida(poke)
        ps.text=poke.vidaActual.toString()+'/'+poke.vidaMaxima
        favorito.image= Image(poke.fav.toURI().toString())
        imagen.image = Image(poke.imagen.toURI().toString())
    }

    fun fondoPokeElegido(nombre: Label,Nv:Label,Ps:Label,pokemon: BorderPane){
        val f = File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\1.png")
        nombre.style = nombre.style+"-fx-text-fill: #D4AC0D;"
        Nv.style = Nv.style+"-fx-text-fill: #D4AC0D;"
        Ps.style = Ps.style+"-fx-text-fill: #D4AC0D;"
        pokemon.style = pokemon.style+"-fx-background-image: url(\"${f.toURI().toURL()}\")"

    }
    fun fondoPokeNo(nombre: Label,Nv:Label,Ps:Label,pokemon: BorderPane){
        nombre.style = nombre.style+"-fx-text-fill: white ;"
        Nv.style = Nv.style+"-fx-text-fill: white;"
        Ps.style = Ps.style+"-fx-text-fill: white ;"
        pokemon.style = pokemon.style+"-fx-background-color: none;-fx-border-color: none;-fx-border-style:none;-fx-border-width:0;"
    }

    fun initialize() {
        fondo.image= Image(File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fondo.jpg").toURI().toString())

        pokemonAmigo.add(pokemonAmigo1)
        pokemonAmigo.add(pokemonAmigo2)
        pokemonAmigo.add(pokemonAmigo3)
        pokemonAmigo.add(pokemonAmigo4)
        pokemonAmigo.add(pokemonAmigo5)
        pokemonAmigo.add(pokemonAmigo6)

        elegir.disableProperty().set(true)

        fav00.visibleProperty().set(false)
        fav10.visibleProperty().set(false)
        fav20.visibleProperty().set(false)
        fav01.visibleProperty().set(false)
        fav11.visibleProperty().set(false)
        fav21.visibleProperty().set(false)

        configurarPoke(Nombre00,Nv00,foto00,genero00,vida00,Ps00,fav00,pokemonAmigo[0])
        configurarPoke(Nombre10,Nv10,foto10,genero10,vida10,Ps10,fav10,pokemonAmigo[1])
        configurarPoke(Nombre20,Nv20,foto20,genero20,vida20,Ps20,fav20,pokemonAmigo[2])
        configurarPoke(Nombre01,Nv01,foto01,genero01,vida01,Ps01,fav01,pokemonAmigo[3])
        configurarPoke(Nombre11,Nv11,foto11,genero11,vida11,Ps11,fav11,pokemonAmigo[4])
        configurarPoke(Nombre21,Nv21,foto21,genero21,vida21,Ps21,fav21,pokemonAmigo[5])



    }
    @FXML private fun poke00(){
        fondoPokeElegido(Nombre00,Nv00,Ps00,pokemon00)
        fondoPokeNo(Nombre10,Nv10,Ps10,pokemon10)
        fondoPokeNo(Nombre20,Nv20,Ps20,pokemon20)
        fondoPokeNo(Nombre01,Nv01,Ps01,pokemon01)
        fondoPokeNo(Nombre11,Nv11,Ps11,pokemon11)
        fondoPokeNo(Nombre21,Nv21,Ps21,pokemon21)
        elegir.disableProperty().set(false)
        elegirLuchador=pokemonAmigo1
    }
    @FXML private fun poke10(){
        fondoPokeElegido(Nombre10,Nv10,Ps10,pokemon10)
        fondoPokeNo(Nombre00,Nv00,Ps00,pokemon00)
        fondoPokeNo(Nombre20,Nv20,Ps20,pokemon20)
        fondoPokeNo(Nombre01,Nv01,Ps01,pokemon01)
        fondoPokeNo(Nombre11,Nv11,Ps11,pokemon11)
        fondoPokeNo(Nombre21,Nv21,Ps21,pokemon21)
        elegir.disableProperty().set(false)
        elegirLuchador=pokemonAmigo2
    }
    @FXML private fun poke20(){
        fondoPokeElegido(Nombre20,Nv20,Ps20,pokemon20)
        fondoPokeNo(Nombre10,Nv10,Ps10,pokemon10)
        fondoPokeNo(Nombre00,Nv00,Ps00,pokemon00)
        fondoPokeNo(Nombre01,Nv01,Ps01,pokemon01)
        fondoPokeNo(Nombre11,Nv11,Ps11,pokemon11)
        fondoPokeNo(Nombre21,Nv21,Ps21,pokemon21)
        elegir.disableProperty().set(false)
        elegirLuchador=pokemonAmigo3
    }
    @FXML private fun poke01(){
        fondoPokeElegido(Nombre01,Nv01,Ps01,pokemon01)
        fondoPokeNo(Nombre10,Nv10,Ps10,pokemon10)
        fondoPokeNo(Nombre20,Nv20,Ps20,pokemon20)
        fondoPokeNo(Nombre00,Nv00,Ps00,pokemon00)
        fondoPokeNo(Nombre11,Nv11,Ps11,pokemon11)
        fondoPokeNo(Nombre21,Nv21,Ps21,pokemon21)
        elegir.disableProperty().set(false)
        elegirLuchador=pokemonAmigo4
    }
    @FXML private fun poke11(){
        fondoPokeElegido(Nombre11,Nv11,Ps11,pokemon11)
        fondoPokeNo(Nombre10,Nv10,Ps10,pokemon10)
        fondoPokeNo(Nombre20,Nv20,Ps20,pokemon20)
        fondoPokeNo(Nombre01,Nv01,Ps01,pokemon01)
        fondoPokeNo(Nombre00,Nv00,Ps00,pokemon00)
        fondoPokeNo(Nombre21,Nv21,Ps21,pokemon21)
        elegir.disableProperty().set(false)
        elegirLuchador=pokemonAmigo5
    }
    @FXML private fun poke21(){
        fondoPokeElegido(Nombre21,Nv21,Ps21,pokemon21)
        fondoPokeNo(Nombre10,Nv10,Ps10,pokemon10)
        fondoPokeNo(Nombre20,Nv20,Ps20,pokemon20)
        fondoPokeNo(Nombre01,Nv01,Ps01,pokemon01)
        fondoPokeNo(Nombre11,Nv11,Ps11,pokemon11)
        fondoPokeNo(Nombre00,Nv00,Ps00,pokemon00)
        elegir.disableProperty().set(false)
        elegirLuchador=pokemonAmigo6
    }
    // AL CLICKAR EL BOTON NOS VAMOS A LA SIGUIENTE PANTALLA
    var stage: Stage? = null
    @FXML fun elegirPulsado() {
        elegir.disableProperty().set(true)

        try {
            if (stage == null) {

                val stage = Stage()
                val loader = FXMLLoader(PokeApplication::class.java.getResource("escena2.fxml"))
                val scene = Scene(loader.load(), 700.0, 500.0)
                stage.title = "Batalla Pokemon"
                stage.scene = scene
                stage.isResizable = false
                stage.show()
                var controllerBatalla = loader.getController<BatallaController>()
                controllerBatalla.traerPokemon(elegirLuchador)
                controllerBatalla.enviarDatos(this)

            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    // FUNCION PARA PODER ACTUALIZAR LOS DATOS OBTENIDOS DE LA BATALLA
    fun actualizarDatos() {
        configurarPoke(Nombre00,Nv00,foto00,genero00,vida00,Ps00,fav00,pokemonAmigo[0])
        configurarPoke(Nombre10,Nv10,foto10,genero10,vida10,Ps10,fav10,pokemonAmigo[1])
        configurarPoke(Nombre20,Nv20,foto20,genero20,vida20,Ps20,fav20,pokemonAmigo[2])
        configurarPoke(Nombre01,Nv01,foto01,genero01,vida01,Ps01,fav01,pokemonAmigo[3])
        configurarPoke(Nombre11,Nv11,foto11,genero11,vida11,Ps11,fav11,pokemonAmigo[4])
        configurarPoke(Nombre21,Nv21,foto21,genero21,vida21,Ps21,fav21,pokemonAmigo[5])
    }
    fun actualizarfavoritos() {
        if (elegirLuchador == pokemonAmigo1){
            fav00.visibleProperty().set(true)
        }
        if (elegirLuchador == pokemonAmigo2){
            fav10.visibleProperty().set(true)
        }
        if (elegirLuchador == pokemonAmigo3){
            fav20.visibleProperty().set(true)
        }
        if (elegirLuchador == pokemonAmigo4){
            fav01.visibleProperty().set(true)
        }
        if (elegirLuchador == pokemonAmigo5){
            fav11.visibleProperty().set(true)
        }
        if (elegirLuchador == pokemonAmigo6){
            fav21.visibleProperty().set(true)
        }
    }

    var stage2: Stage? = null
    fun pokedexClick() {
        try {
            if (stage2 == null) {
                val stage = Stage()
                val loader = FXMLLoader(PokeApplication::class.java.getResource("pokedex.fxml"))
                val scene = Scene(loader.load(), 400.0, 500.0)
                stage.title = "Pokedex"
                stage.scene = scene
                stage.isResizable = false
                stage.show()
                var controllerPokedex = loader.getController<PokedexController>()
                controllerPokedex.traerEleccion(elegirLuchador)
                controllerPokedex.hacerFavoritos(this)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}

