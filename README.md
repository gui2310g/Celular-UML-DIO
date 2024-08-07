
# Celular-UML-DIO

Realização do desafio Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet do Bootcamp DIO Claro - Java
Com Spring Boot


## UML do projeto

O desafio foi feito de um contexto diferente, utilizando uma interface Celular onde tem o CelularBase como implementação com as classes Reprodutor Musical, Aparelho Telefonico e Navegador de Internet


![UML](https://github.com/user-attachments/assets/9444ccbc-19ab-4fa1-8a4f-e3b541d39502)



## Documentação

#### Interface Celular

```java
public interface Celular {
    void ligar();
    void desligar();
}
```
#### Celular Base com suas classes
```java
public class CelularBase implements Celular{
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public CelularBase() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Celular ");
    }
    public void desligar() {
        System.out.println("Desligando celular ");
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}

public class ReprodutorMusical  {

    public void tocar() {
        System.out.println("Tocando musica: ");
    }

    public void pausar() {
        System.out.println("Pausando a musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}

public class AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo o celular: ");

    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio por Voz");
    }
}

public class NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar nova pagina");
    }
}


```

#### Main
```java
  public class Main {
        public static void main(String[] args) {
            CelularBase android = new CelularBase();
            CelularBase iphone = new CelularBase();

            android.ligar(); 
            android.getReprodutorMusical().selecionarMusica("Adele"); // resultado: Selecionando Musica: Adele //
            android.desligar();

            iphone.ligar();
            iphone.getNavegadorInternet().exibirPagina("Youtube"); // resultado: Exibindo página: Youtube //
            iphone.getAparelhoTelefonico().ligar("40228922"); // resultado: Ligando para 40228922 //
            iphone.desligar();
        }
    }


