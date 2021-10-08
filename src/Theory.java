public class Theory {

    public static void GitTags(){
        System.out.println("Git Tags é um sistema que permite adicionar, remover ou listar as tags, que geralmente são " +
                "usadas para definir as versões da release.");
        System.out.println("v1.0, v1.1.0, etc.");
        System.out.println("São divididas em lightweight e annotated, sendo uma só para apontar para um commit e outra " +
                "para exibir uma informação mais detalhada do commit, como que commitou, data, e-mail e pode conter uma " +
                "mensagem");
        System.out.println("Para criar uma tag lightweight é usado sufixo -lw e para annotated é usado -a, -m pode ser " +
                "usado de forma opcional para adicionar uma mensagens");
        System.out.println("$ git tag -a 1.1.2 -m \"minha mensagem\"");
        System.out.println("O Comando \"git show\" mostra informação extra sobre a tag");
        System.out.println("É possível adicionar uma tag através do comando \"git tag\" mas é necessário o checksum " +
                "ou parte dele para localizar o commit");
        System.out.println("$ git tag -a 1.1.1 8f6a89r");
    }

    public static void GitCherryPick(){
        System.out.println("Git Cherry Pick é um comando que pode ser usado para inserir um commit de uma branch em " +
                "outra, pode ser usado para buscar uma funcionalidade implementada em uma branch sem a necessidade de " +
                "integrar tudo que foi desenvolvido na outra branch.");
        System.out.println("Também pode ser usado para aplicar um hotfix de uma branch na outra, caso ambas compartilhem " +
                "a mesma funcionalidade");
        System.out.println("O comando \"$ git cherry-pick master\" vai pegar o commit mais recente feito na branch " +
                "master e colocá-lo na branch atual");
        System.out.println("Também pode ser usado para pegar um commit especifico através do checksum do commit, com " +
                "isso o comando seria \"$ git cherry-pick 'checksum do commit'\" sem os ' ");
        System.out.println("Um intervalo entre commits também pode ser adicionado.");
        System.out.println("Ex: Com o 'CommitUM' incluso \"$ git cherry-pick 'CommitUM^..CommitN'\" sem os ' ");
        System.out.println("Ex: Sem o 'CommitUM' incluso \"$ git cherry-pick 'CommitUM..CommitN'\" sem os ' ");
        System.out.println("Subcomandos como --continue, --quit, --abort e --skip, podem ser usados para manipular o" +
                "cherry-pick.");
        System.out.println("A principal diferença do --quit para o --abort é que o quit encerra a sequencia atual enquanto " +
                "o --abort cancela o cherry-pick todo.");
    }

    public static void MergeVSPull(){
        System.out.println("São abordagens ligeiramente diferentes para a mesma funcionalidade, por isso a diferença no " +
                "nome. Ferramentas como GitHub e Bitbucket escolheram o nome \"pull request\" pela ação de \"puxar\" a " +
                "nova funcionalidade para a branch");
        System.out.println("O fluxo em ambas as formas são parecidos, onde uma branch de origem e uma branch de destino " +
                "são selecionadas e depois o merge request/pull request é criado, através dele é possível ver as alterações " +
                "feitas no código e é necessário fazer uma review dos conteúdos antes de aceitar as alterações, no caso de " +
                "conflitos é necessário que eles sejam corrigidos antes de prosseguir com a integração");
    }

    public static void Checksum(){
        System.out.println("** Checksum é um código usado para facilitar a verificação da integridade dos dados ou para " +
                "verificar alterações dos dados, pois a função que gera o checksum cria resultados consideravelmente " +
                "diferentes para alterações minímas nos dados.");
        System.out.println("** O checksum de cada commit pode ser obtido através do comando \"$ git log\"");
    }

    public static void main(String[] args) {
        Theory.GitTags();
    }
}
