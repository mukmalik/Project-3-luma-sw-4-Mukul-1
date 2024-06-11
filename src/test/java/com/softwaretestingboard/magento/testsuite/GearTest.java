package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {

        //homePage.mouseHoverGearAndSelectBags();
    }


    @Test
    public void clickAndSelectBags()
    {
        homePage.mouseHoverGearAndSelectBags();
    }

}