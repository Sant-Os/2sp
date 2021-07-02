import java.util.ArrayList;
public class Estudiante{
    private ArrayList<String> estudiante;
    public Estudiante(){
        estudiante = new ArrayList<>();
    }
    public  void añadirNombre(String nom){
        estudiante.add(nom);
    }
    public int getEstudiante(){
        return estudiante.size();
    }
    public void listaNomEst(int index){
        if(index >= 0 && index < estudiante.size()){
            String nom = estudiante.get(index);
            System.out.println(estudiante);
        }
    }
    public void borrarEstudiante(int index){
        if(index >= 0 && index < estudiante.size()){
            estudiante.remove(index);
        }
    }
}