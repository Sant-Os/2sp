public class Aula{
    
    Estudiante[] estudiante;
    int registrados;
    public Aula(int cantidadAlumnos){
        estudiante= new Estudiante[cantidadAlumnos];
        registrados=0;
    }
    public String anadirNota(Estudiante estu1){
        String reporte="";
        if(registrados<estudiante.length){
            estudiante[registrados]=estu1;
            registrados++;
            reporte="registrado";
        }else{
            reporte="Aula llena";
        }
        return reporte;
    }
    public double promedioTodas(){
        double total=0;
        int i=0;
        while(i <estudiante.length){
            total=total+estudiante[i].getNota();
            i++;
        }
        double promedioNotas=total/i;
        return promedioNotas;
    }
    public double promedioAprobadas(){
        double proAprobadas,nota;
        double suma=0;
        int contador=0;
        for(int i=0;i <estudiante.length;i++){
            nota=estudiantes[i].getNota();
            if(nota>51){
                suma=suma+nota;
                contador++;
            }
        }
        proAprobadas=suma/contador;
import java.util.ArrayList;
public class Aula
{
    Estudiante estudiante;
    private ArrayList<String> estu;
    private ArrayList<Integer>nota;
    public Aula(Estudiante estudiante ){
        nota = new ArrayList<Integer> (); 
        estu = new ArrayList<String> ();
        estudiante = new Estudiante();
    }
    public  void añadirNota(int notaEs){
        nota.add(notaEs);
    }
    public void agregarEstudiante(String est){
        estu.add(est);
    }
    public int getNumerodeNota(){
        return nota.size();
    }
    public int getNumeroEstudi(){
        return estu.size();
    }
    public void listaNotas(int index){
    if(index >= 0 && index < nota.size()){
            int notaEs = nota.get(index);
            System.out.println(nota);
        }
    }
    public void listaEstudi(int index){
        if(index >= 0 && index < estu.size()){
            String est = estu.get(index);
            System.out.println(estu);
        }
    }
    public void borrarNota(int index){
        if(index >= 0 && index < nota.size()){
            nota.remove(index);
        }
    }
    public void borrarEstudi(int index){
        if(index >= 0 && index < estu.size()){
            estu.remove(index);
        }
    }
    public String promedioNotas(){
        return " las notas son: "+ "\n" + estu +"\n"+ nota;
    }
    public String promedioNotasAprobadas(int index){
        String aux;
        aux = "Si la nota es mayor o igual a 51 esta aprodado "+"\n" +nota;
        return  aux;
    }   
    public  String cantidadReprobados(int index){
        String aux1 ;
        aux1 = "Si la nota es mernor que 51 esta reprovado "+"\n"+estu+"\n" + nota;
        return aux1;
    }
    public  String cantidadAprobados(int index){
        String aux2;
        aux2 = "Si la nota es mayor o igual que 51 esta aprovado" +"\n"+estu+"\n" + nota;
        return aux2;
    }
    public  String notaAlta(int index){
        String aux3;
        aux3 = "la nota mas alta es mayor que 80: "+"\n"+estu+"\n" + nota;;
        return aux3;
    }
}