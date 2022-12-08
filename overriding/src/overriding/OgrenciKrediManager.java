package overriding;

public class OgrenciKrediManager extends BaseCreditManager {
	
	// biz burada basecredit managerdaki gibi hesaplayı aynı imza ile yazdığımız için
	// artık basedeki değil ogrenci için buradakı calısacak.
	// burada  basedeki hesaplayı ezdik
	// bu C# da virtual methodlarla yağılır ve sonra bu methodlar override edilir.
	public double hesapla(double tutar) {
		return tutar*1.10;
		
	}

}
