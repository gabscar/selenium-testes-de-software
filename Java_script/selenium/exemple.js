const {By,Key,Builder} = require("selenium-webdriver");
require("chromedriver");
 
async function example(){
 
   
 
       let driver = await new Builder().forBrowser("chrome").build();
 
        await driver.get("http://127.0.0.1:5500");
            
        await driver.findElement(By.name("btn-random-game")).click();
        await driver.findElement(By.name("btn-add-cart")).click();
        await driver.findElement(By.name("btn-delete")).click();
        //add mega
        await driver.findElement(By.name("Mega-Sena")).click();
        await driver.findElement(By.name("btn-random-game")).click();
        await driver.findElement(By.name("btn-add-cart")).click();
        //add loto
        await driver.findElement(By.name("Lotofácil")).click();
        await driver.findElement(By.name("btn-random-game")).click();
        await driver.findElement(By.name("btn-add-cart")).click();
        //add quina
        await driver.findElement(By.name("Quina")).click();
        await driver.findElement(By.name("btn-random-game")).click();
        await driver.findElement(By.name("btn-add-cart")).click();
       
        setTimeout(function(){ driver.close() }, 8000);
 
}
 
example()