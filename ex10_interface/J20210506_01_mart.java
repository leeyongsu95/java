package ex10_interface;

import java.util.ArrayList;
import java.util.List;

interface ProductCorner{ //공산품코너
	public List<String> getProductItem(); 
	public void setProductItem(String...s);
	void productNamePrint();
}
interface MeatCornet{ //정육코너
	public List<String> getMeatItem();
	public void setMeatItem(List<String> meatItem);
	void meatNamePrint();
}
interface  ClothCorner{ //의류코너
	public List<String> getClothItem();
	public void setClothItem(List<String> clothItem);
	void clothNamePrint(String...s);
}

class HeadOffice{  //본사
	private String companyNmae = "홈플러스";
	private String registrationNumber = "02-203-2050";
	
	void companyInfoPrint() {
		System.out.println("****" + companyNmae + "****");
		System.out.println("--------------------");
		System.out.println("[NO]" + registrationNumber);
	}
}

class Branch1 extends HeadOffice implements MeatCornet,ProductCorner{//지점1
	private String branchName="신림점";
	private List<String> meatItem; 
	private List<String> productItem; //공산품 상품 목록
	
	//세터, 게터 
	@Override
	public List<String> getProductItem() {
		return productItem;
	}
	@Override
	public void setProductItem(String...s) {
		productItem = new ArrayList<>();
		for(String item :s) {
			productItem.add(item);
		}
	}
	@Override
	public List<String> getMeatItem() {
		return meatItem;
	}
	@Override
	public void setMeatItem(List<String> meatItem) {
		this.meatItem = meatItem;
	}	
	
	@Override
	public void productNamePrint() {
		System.out.println("[" + branchName +"] 공산품 코너");
		System.out.println("--------------------");
		for(String item:productItem) {
			System.out.println(item +" ");
		}
		System.out.println("--------------------");
	}
	@Override
	public void meatNamePrint() {
		System.out.println("[" + branchName +"] 정육점 코너");
		System.out.println("--------------------");
		for(String item:meatItem) {
			System.out.println(item +" ");
		}	
		System.out.println("--------------------");
	}
}

public class J20210506_01_mart {
	public static void main(String[] args) {
		Branch1 b1= new Branch1();
		b1.companyInfoPrint();
		System.out.println("--------------------");
		//공산품 코너 : 가변인자
		b1.setProductItem("생활용품","문구", "침구", "가전");
		b1.productNamePrint();
		//고기코너 : 상품 리스트 객체생성
		List<String> meatItem = new ArrayList<>();
		meatItem.add("소고기");
		meatItem.add("돼지고기");
		b1.setMeatItem(meatItem);
		b1.meatNamePrint();
		
		
	}
}
