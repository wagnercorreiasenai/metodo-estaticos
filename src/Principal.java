
public class Principal {

    public static void main(String[] args) {
        
        //Cria o objeto pessoa
        Pessoa p = new Pessoa();
        p.nome = "João Silva";
        p.cpf = "09008851903";
        p.rg = "456565";
        p.dataNacimenmto = "04/06/2000";
        p.nomeDaMae = "Maria da Silva";
        p.nomeDoPai = "José da Silva";
        p.telefones = "(47) 3350-4226, (47) 9012-2163";

        Endereco e = new Endereco();
        e.rua = "João Bauer";
        e.bairro = "Centro 1";
        e.cep = "88350100";
        e.complemento = "Próximo a prefeitura";        
        p.setEndPessoa(e);
        
        System.out.println(p.getPrimeiroNome());
    }

}
