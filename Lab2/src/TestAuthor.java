import java.lang.*;

public class TestAuthor
{
    public static void main(String[] arg)
    {
        Author Ann = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'F');
        Author Ivan = new Author("Ivan Popov", "ivPopov@somewere.com", 'M');
        System.out.println(Ann);
        System.out.println(Ivan);
        Ivan.setEmail("IvanPopov@somewere.com");
        System.out.println(Ivan);
        char a;
        char b;
        a='A';
        b ='B';
        System.out.println(a + b);
    }
}
