package org.example.Sprint2;

public class Question2 {
    private String pregunta;//atributo para almacenar la pregunta
    private String alternativa1;//atributo para almacenar la altenativa1
    private String alternativa2;//atributo para almacenar la altenativa2
    private String alternativa3;//atributo para almacenar la altenativa3
    private String alternativa4;//atributo para almacenar la altenativa4
    private String respuesta;//atributo para almacenar la respuesta correcta

    public Question2(String pregunta, String alternativa1,
                     String alternativa2, String alternativa3,
                     String alternativa4, String respuesta) {//constructor de la clase Question
        this.pregunta = pregunta;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.respuesta = respuesta;
    }

    //Metodos getter y setter de cada atributo de la clase
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public String getAlternativa(int alternativa){
        switch (alternativa){
            case 1: return getAlternativa1();
            case 2: return getAlternativa2();
            case 3: return getAlternativa3();
            case 4: return getAlternativa4();
        }
        return "";
    }
}


