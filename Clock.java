public class Clock{
  //Este es el objeto actual
  private int hr,
              min,
              sec;
              //Es muy importatne que los atributos sean privados, para que no puedan ser modificados.
              //Usamos un setter para poder validar que las horas esten en un rango de horas
              //Si no usamos un setter no podemos validar


  public Clock(){ //Es un contructor por que no tiene valor de retorno y se llama igual que la clase
    this(12,0,0); //Usar this hace mas facil leer el codigo....Aqui se esta llamando a un contructor
                  //Usar this para mandar llamar a un constructor a partir de usar parentesis y el tipo de parametros que coincida con un constructor
                  //Para mandar llamar a un constructor se tiene que poner en la primera linea del constructor
                  //Para llamar constructores se hacen en la primera linea de un construcotr usando this
  }

  public Clock(int hr, int min, int sec){
    this.setTime(hr,min,sec);
  }

  public void setTime(int hr, int min, int sec){

    if(hr >= 0 && hr<24){
      this.hr = hr;
    } else{
      this.hr = 12;
    }

    if (min >= 0 && min <60){
      this.min = min;
    } else {
      this.min = 0;
    }

    if (min >= 0 && min <60){
      this.sec = sec;
    } else {
      this.sec = 0;
    }
  }

  public int getHours() {
    return this.hr;
  }

  public int getMinutes(){
    return this.min;
  }

  public int getSeconds(){
    return this.sec;
  }

  public void incrementHours(){
    this.hr=(this.hr+1)%24;

    //Estas dos son equivalntes
    /*
    if (this.hr < 23){
        this.hr++;
    } else{
      this.hr = 0;
    }
    */

  }

  public void incrementMinutes(){


    if (this.min<59){
      this.min++;
    } else{
      this.min = 0;
      this.incrementHours();
    }

  }

  public void incrementSeconds(){
    if (this.sec < 59){
      this.sec++;
    } else{
      this.sec = 0;
      this.incrementMinutes();
    }
  }


  public void printTime(){
    System.out.println(this.hr + ":" + this.min + ":" + this.sec); //Buna practica poner el this por que no es una variable local
  }

  public boolean equals(Clock reloj){
    //Estas dos son equivalentes
    return this.hr == reloj.hr && this.min == reloj.min && this.sec == reloj.sec;

    /*
    if (this.hr == reloj.hr && this.min == reloj.min && this.sec == reloj.sec) {
      return true;
    } else {
      return false;
    } */
  }

  public void makeCopy(Clock reloj){
    this.hr = reloj.hr;
    this.min = reloj.min;
    this.sec = reloj.sec;

    // Son Equivalentes: this.setTime(reloj.hr,reloj.min,reloj.sec);
  }


  public Clock getCopy(){
    return new Clock(this.hr,this.min,this.sec);
    }

}
