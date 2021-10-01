public class Theory {

    public static void GitTags(){
        System.out.println("Git Tags é um sistema que permite adicionar, remover ou listar as tags, que geralmente são " +
                "usadas para defininir as versões da release.");
        System.out.println("v1.0, v1.1.0, etc.");
        System.out.println("São divididas em lightweight e annotated, sendo uma só para apontar para um commit e outra " +
                "para exibir uma informação mais detalhada do commit, como que commitou, data, email e pode conter uma " +
                "mensagem");
        System.out.println("Para criar uma tag lightweight é usado sufixo -lw e para annotated é usado -a, -m pode ser " +
                "usado de forma opcional para adicionar uma mensagens");
        System.out.println("$ git tag -a 1.1.2 -m \"minha mesagem\"");
        System.out.println("O Comando \"git show\" mostra informação extra sobre a tag");
        System.out.println("É possivel adicionar uma tag através do commando \"git tag\" mas é nescessário o checksum " +
                "ou parte dele para localizar o commit");
        System.out.println("$ git tag -a 1.1.1 8f6a89r");
    }

    public static void GitCherryPick(){
        System.out.println("Git Cherry Pick é um comando que pode ser usado para inserir um commit de uma branch em " +
                "outra, pode ser usado para buscar uma funcionalidade implementada em uma branch sem a nescessidade de " +
                "integrar tudo que foi desenvolvido na outra branch.");
        System.out.println("Também pode ser usado para aplicar um hotfix de uma branch na outra, caso ambas compartilhem " +
                "a mesma funcionalidade");
        System.out.println("O comando \"$ git cherry-pick master\" vai pegar o commit mais recente feito na branch " +
                "master e colocalo na branch atual");
        System.out.println("Também pode ser usardo para pegar um commit especifico atrávez do checksum do commit, com " +
                "isso o comando seria \"$ git cherry-pick 'checksum do commit'\" sem os ' ");
        System.out.println("Um intervalo entre commits também pode ser adicionado.");
        System.out.println("Ex: Com o 'CommitUM' incluso \"$ git cherry-pick 'CommitUM^..CommitN'\" sem os ' ");
        System.out.println("Ex: Sem o 'CommitUM' incluso \"$ git cherry-pick 'CommitUM..CommitN'\" sem os ' ");
        System.out.println("Subcomandos como --continue, --quit, --abort e --skip, podem ser usados para manipular o" +
                "cherry-pick.");
        System.out.println("A principal diferença do --quit para o --abort é que o quit encerra a sequencia atual enqunto " +
                "o --abort cancela o cherry-pick todo.");
    }

    public static void Checksum(){
        System.out.println("** Checksum é um código usado para facilitar a verificação da integridade dos datos ou para " +
                "verificar alterações dos dados, pois a função que gera o checksum cria resultados consideravelmente " +
                "diferentes para alterações minimas nos dados.");
        System.out.println("** O checksum de cada commit pode ser obtido atrávez do comando \"$ git log\"");
    }

    public static void main(String[] args) {
        Theory.GitTags();
    }
}
