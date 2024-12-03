package com.soft.magento.testsuite;

import com.soft.magento.pages.MenPage;
import com.soft.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        //Click on Content Tab
        menPage.clickOnConsent();

        //1.Mouse Hover on the ‘Men’ Menu
        menPage.mouseHoverOnMenMenu();

        //2.Mouse Hover on the ‘Bottoms’
        menPage.mouseHoverBottoms();

        //3.Click on the ‘Pants’
        menPage.clickOnPants();

        //4.Mouse Hover on the product name‘Cronus Yoga Pant’ and click on the size 32.
        menPage.mouseHoverOnCronusYogaPantAndClick();

        //5.Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the Color Black.
        menPage.clickOnColorBlack();

        //6.Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
        menPage.mouseHoverAndAddToCart();

        //7.Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        menPage.verifyTextCronusYogaPant();
        String expectedText = "You added Cronus Yoga Pant to your shopping cart";
        String actualText = menPage.verifyTextCronusYogaPant();
        Assert.assertEquals(actualText,expectedText,"You added Cronus Yoga Pant to your shopping cart not displayed");

        //8.Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCart();

        //9.Verify the text ‘Shopping Cart.'
        menPage.verifyTextShoppingCart();
        String expectedTextIs = "Shopping Cart";
        String actualTextIs = menPage.verifyTextShoppingCart();
        Assert.assertEquals(actualTextIs,expectedTextIs,"Shopping Cart text is not displayed");

        //10.Verify the product name ‘Cronus Yoga Pant’
        menPage.verifyProductName();
        String expectedName = "Cronus Yoga Pant";
        String actualName = menPage.verifyProductName();
        Assert.assertEquals(actualName,expectedName,"Cronus Yoga Pant product name not displayed");

        //11.Verify the product size ‘32’
        menPage.verifyProductSize();
        String expectedSize = "32";
        String actualSize = menPage.verifyProductSize();
        Assert.assertEquals(actualSize,expectedSize,"Size 32 not displayed");

        //12.Verify the product colour ‘Black’
        menPage.verifyProductColour();
        String expectedColour = "Black";
        String actualColour = menPage.verifyProductColour();
        Assert.assertEquals(actualColour,expectedColour,"Black colour not displayed");

    }
}
