package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Login")
    void generatedTest() {
        step("Open 'http://192.168.194.69:8181/manager/login/?logout'", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#username\").setValue(root);", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#password\").setValue(\"fesb1!\")", () -> {
            step("// todo: just add selenium action");
        });
    }
}