package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By womenMenuLink = By.xpath("//span[normalize-space()='Women']");
    By subMenu = By.id("ui-id-9");
    By jackets = By.id("ui-id-11");
    By bottoms = By.id("ui-id-18");
    By pantsLink = By.id("ui-id-23");
    By gearMenu = By.id("ui-id-6");
    By menMenu = By.id("ui-id-5");
    By bags = By.xpath("//span[normalize-space()='Bags']");

    // mouse hover women menu
    public void mouseHover()
    {
        mouseHoverToElement(womenMenuLink);
    }

    public void mouseHoverTop()
    {
     mouseHoverToElement(subMenu);
    }

    public void mouseHoverAndClickJackets()
    {
     mouseHoverToElementAndClick(jackets);
    }

    //  *   *   *  *   * 2nd MenTest  *  *   *   *  *   *   * Main Menu Men  *   *   *  *   *   *  *   *   *  *   *   *

    // Mouse Hover on Men Menu
    public void mouseHoverMenMenu()
    {
        mouseHoverToElement(menMenu);

    }

    // Mouse Hover on Bottoms
    public void mouseHoverOnButtoms()
    {
        mouseHoverToElement(bottoms);

    }

    // Click on Pants
    public void clickOnPants()
    {
        clickOnElement(pantsLink);

    }
//  *   *   *  *   * 3rd Gear Test  *  *   *   *  *   *   * Main Menu Gear  *   *   *  *   *   *  *   *   *  *   *   *

    // Mouse Hover on Gear Menu
    public void mouseHoverGearAndSelectBags()
    {
        mouseHoverToElement(gearMenu);
    }

    //Click on Bags
    public void ClickAndSelectBags()
    {
        clickOnElement(bags);
    }

}
