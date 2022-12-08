package overriding;

public class BaseCreditManager {
	public double hesapla (double tutar)
	{
		return tutar*1.18;
				
	}
	// bi ogrenci classında hesaplayı ezdik eğer biz bu methodun asla 
	// ezilmemesini istiyorsak o zaman bu metotu final yani sabit olarak
	// tanımlamamız gerecek.
	
	/*public final double hesapla (double tutar)
	{
		return tutar*1.18;
				
	}*/

}
