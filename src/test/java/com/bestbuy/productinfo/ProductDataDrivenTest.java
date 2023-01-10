package com.bestbuy.productinfo;

import com.bestbuy.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@Concurrent(threads = "8x")
@UseTestDataFrom("src/test/java/com/bestbuy/resources/testdata/productsinfo.csv")
@RunWith(SerenityRunner.class)

public class ProductDataDrivenTest extends TestBase {
    private String name;
    private String type;
    private int price;
    private String upc;
    private int shipping;
    private String description;
    private String manufacturer;
    private String model;
    private String url;
    private String image;
    @Steps
    ProductSteps productSteps;

    @Title("Creating multiple products with Data driven")
    @Test
    public void createMultipleProduct() {
        productSteps.addProduct(name, type, price, shipping, upc, description, manufacturer, model, url, image).statusCode(201);
    }


}
