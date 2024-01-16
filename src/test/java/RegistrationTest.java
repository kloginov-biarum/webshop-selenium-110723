import org.junit.Test;

public class RegistrationTest extends BaseTest{

    @Test
    public void successRegistration(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.choseGenderMale();



        //assert that text "Your registration completed" is displayed
    }


}
