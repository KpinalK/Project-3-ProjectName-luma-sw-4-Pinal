package com.soft.magento.testsuite;

import com.soft.magento.pages.WomenPage;
import com.soft.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //Click on Content Tab
        womenPage.clickOnConsent();

        //1.Mouse Hover on the ‘Women’ Menu
        womenPage.mouseHoverOnWomen();

        //2.Mouse Hover on the ‘Tops’
        womenPage.mouseHoverOnTops();

        //3.Click on the ‘Jackets’
        womenPage.clickOnJackets();

        //4.Select Sort By filter “Product Name”
        womenPage.selectSortByProductName();

        //Verify the product name displayed in alphabetical order
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        //Click on Content Tab
        womenPage.clickOnConsent();

        //1.Mouse Hover on the ‘Women’ Menu
        womenPage.mouseHoverOnWomen();

        //2.Mouse Hover on the ‘Tops’
        womenPage.mouseHoverOnTops();

        //3.Click on the ‘Jackets’
        womenPage.clickOnJackets();

        //4. Select Sort By filter “Price”
        womenPage.selectSortByProductPrice();
    }
}
