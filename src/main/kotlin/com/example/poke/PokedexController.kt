package com.example.poke

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.text.Text
import javafx.stage.Stage
import java.io.File
import kotlin.system.exitProcess



class PokedexController {
    var hacerFavoritos = ElegirPokemonController()
    lateinit var miPokedex : Pokemon

    @FXML private lateinit var fondoPokedex : ImageView
    @FXML private lateinit var pokemonPokedex : ImageView
    @FXML private lateinit var informacion : Text
    @FXML private lateinit var preEvo : ImageView
    @FXML private lateinit var flecha : ImageView
    @FXML private lateinit var Evo: ImageView
    @FXML private lateinit var favorito : Label
    @FXML private lateinit var salir : Label
    @FXML private lateinit var  nombrePokedex: Label
    @FXML private lateinit var  estrella: ImageView

    fun initialize() {
        fondoPokedex.image = Image(File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fondoPokedex.jpg").toURI().toString())
        flecha.image = Image(File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\next.png").toURI().toString())
        estrella.visibleProperty().set(false)
    }
    fun traerEleccion(elegirLuchador: Pokemon) {
        pokemonPokedex.image = Image(elegirLuchador.imagen.toURI().toString())
        nombrePokedex.text = elegirLuchador.Nombre
        informacion.text = elegirLuchador.descripcion
        preEvo.image = Image(elegirLuchador.imagen.toURI().toString())
        Evo.image = Image(elegirLuchador.evolucion.toURI().toString())
        estrella.image = Image(elegirLuchador.fav.toURI().toString())
        miPokedex = elegirLuchador
    }
    @FXML private fun salirClick(){
        (( informacion.scene.window)as Stage).close()
    }
    fun hacerVisible() {
        favorito.visibleProperty().set(true)
        estrella.visibleProperty().set(true)

    }
    @FXML private fun favoritoClick(){
        hacerVisible()
        hacerFavoritos.actualizarfavoritos()
    }
    fun llamarControladorElegir( controlador: ElegirPokemonController){
        this.hacerFavoritos=controlador
    }

}


