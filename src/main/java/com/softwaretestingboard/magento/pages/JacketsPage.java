package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class JacketsPage extends Utility
{
    By dropDown = By.xpath("//div[@class='page-wrapper']");
    By accOrder = By.xpath("//div[@class='column main']");
    //Select Sort By filter “Product Name”
    public void filterProductName()
    {
        selectByIndexFromDropDown(dropDown, 2);
    }

    //Verify the products name display in alphabetical order
    public void displayProductInAlphabeticalOrder()
    {
        clickOnElement(accOrder);
    }

    // Select Sort By filter “Price”
    public void sortJacketsByPrice()
    {

    }

    //Verify the products price display in Low to High
    public void displayJacketsLowToHigh()
    {

    }


}
