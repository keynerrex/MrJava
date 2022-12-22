package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImplementacionCatalogoPeliculas implements ICatalogoPeliculas {

    private final ArrayList<String> ListaPeliculas;

    public ImplementacionCatalogoPeliculas() {
        this.ListaPeliculas = new ArrayList<>();
    }

    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.ListaPeliculas.add(nombrePelicula.toString());
    }

    public ImplementacionCatalogoPeliculas(ArrayList<String> ListaPeliculas) {
        this.ListaPeliculas = ListaPeliculas;
    }
    
    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(
                null,
                this.ListaPeliculas,
                "LISTA DE PELICULAS",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;

        for (var pelicula : this.ListaPeliculas) {

            if (pelicula.equals(nombrePelicula)) {
                resultado = pelicula;
                break;

            } else {
                resultado = pelicula;
            }

        }
        if (nombrePelicula.equals(resultado)) {

            JOptionPane.showMessageDialog(
                    null,
                    "Resultado  -> " + resultado,
                    "BUSCAR PELICULA",
                    JOptionPane.QUESTION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No se encontro la pelicula " + nombrePelicula,
                    "BUSCAR PELICULA",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

}
