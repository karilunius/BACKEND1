package ejemplo1;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class ShopKeeper {  
    private MobileShop iphone;  
    private MobileShop samsung;  
    private MobileShop blackberry;  
      
    public ShopKeeper(){  
        iphone= new Iphone();  
        samsung=new Samsung();  
        blackberry=new Blackberry();  
    }  

    public void iphoneSale(){  
        iphone.modelo();  
        iphone.precio();  
    }  

    public void samsungSale(){  
        samsung.modelo();  
        samsung.precio();  
    }
    
    public void blackberrySale(){  
        blackberry.modelo();  
        blackberry.precio();  
    }  
} 