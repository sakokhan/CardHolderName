import org.example.Account;
import org.junit.Assert;
import org.junit.Test;

public class TestCheckNameToEmboss {
    @Test
    public void TestCheckNamePositive(){
        Account account = new Account("Ivan Ivanov");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertTrue("Корректное значение имени не прошло проверку на валидность", checkName);
    }
    @Test
    public void TestLengthEqualsNineteen(){
        Account account = new Account("Ivanhyj Ivanovjyhgf");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertTrue("Корректное значение имени не прошло проверку на валидность", checkName);
    }
    @Test
    public void TestLengthLassThree(){
        Account account = new Account("II");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertFalse("Некорректное значение имени прошло проверку на валидность", checkName);
    }
    @Test
    public void TestLengthEqualsThree(){
        Account account = new Account("I I");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertTrue("Корректное значение имени не прошло проверку на валидность", checkName);
    }
    @Test
    public void TestLengthMoreNineteen(){
        Account account = new Account("Ivanyhj Hjksyfksheucn");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertFalse("Некорректное значение имени прошло проверку на валидность", checkName);
    }
    @Test
    public void TestNoBlanks(){
        Account account = new Account("IvanyhjHjksyfksheuc");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertFalse("Некорректное значение имени прошло проверку на валидность", checkName);
    }
    @Test
    public void TestBlankBefore(){
        Account account = new Account(" Ivan Ivanov");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertFalse("Некорректное значение имени прошло проверку на валидность", checkName);
    }
    @Test
    public void TestBlankAfter(){
        Account account = new Account("Ivan Ivanov ");
        boolean checkName = account.checkNameToEmboss(account);
        Assert.assertFalse("Некорректное значение имени прошло проверку на валидность", checkName);
    }
}
