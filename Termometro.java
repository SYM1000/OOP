public class Termometro{
  private int temp;

  public termometro(){ //Este es el constructor
    temp = 25;
  }

  public Termometro(int t){ //Este es un constructor
    temp=t;
  }

  public void setTemp(int t){ //Este no es un constructor por eso lleva void
    temp=t;                   //Los constructores no regresan nada
                              //Esto sirve para modificar un valor con "set"
  }

  public int getTemp(){     //Este sirve para consultar un atributo con "get"
    return temp;
  }


}
