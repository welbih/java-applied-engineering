void main() {
    
    /*
        TYPES

    - char -> aceita um caractere : 's'
    - String -> aceita multiplos caracteres :  "Conjunto de texto."
    - boolean -> true/false
    - float/double -> tem casa decimal 
        - float (32 bits)
        - double (64 bits)
    - número inteiro:
        - byte (8 bits) = -2^7 - 128 a 127
        - short (16 bits) = -32768 a 32767
        - int (32 bits) = -2147483648 a 2147483647
        - long (64 bits) = -9223372036854775808 a 9223372036854775807
        
    String não é um tipo primitivo.

    a partir do java var, pode se utilizar o 'var' , 
    que irá utilizar inferencia de tipos. A partir do valor ele verifica o tipo da variável.

    */

   /*
        OPERADORES ARITMÉTICOS 

    - +, -, *, /, %
    - () da precedencia

   */

    // Para aprender mais acesse : dev.java

    String nome = "Sanduíche de Presento do Chaves";
    String descricao = "Sanduíche de presunto simples";
    boolean emPromocao = true;
    double preco = 3.50;
    double precoComDesconto = 2.99;
    Long id = 2L;
    int categoria = 4;

    /*
    categorias
     
      1 - Entradas
      2 - Pratos principais 
      3 - Sobremeses
      4 - Bebidas
     */
    

    double porcentagemDesconto = (preco - precoComDesconto) / preco;
    double valorDesconto = preco * porcentagemDesconto;

    IO.println("Porcentagem de desconto " + porcentagemDesconto);
    IO.println("Valor desconto: " + valorDesconto );
    IO.println("Preço com desconto (calculado): " + (preco - valorDesconto));

    int x = 10;
    int y = 2;
    int z = x / y;
    IO.println(z);


    /*
        CONDICIONAIS
     */

    if(!emPromocao) {
        IO.println("Preço de " + preco + " por " + precoComDesconto);
    } else {
        System.out.printf("Preco: %f \n", preco);
    }

    if(categoria == 1) {
        IO.println("Categoria: Entradas");
    } else if(categoria == 2) {
        IO.println("Categoria: Pratos Principais");
    } else if(categoria == 3) {
        IO.println("Categoria: Sobremeses");
    }

    switch (categoria) {
        case 3:
            IO.println("Categoria: Sobremeses");
            break;
        case 4:
            IO.println("Categoria: Bebidas");
            break;
        default:
            IO.println("Categoria não encontrada.");
    }
}