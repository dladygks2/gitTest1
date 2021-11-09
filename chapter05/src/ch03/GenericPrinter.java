package ch03;

public class GenericPrinter<T> {

	// T��� ��ü ���ڸ� ����Ѵ�. T = �ӽð�, �ƹ����̳� ���� �� �ִٴ� �ǹ�
	// E - element, K - key, V - value
	// �ڷ��� �Ű�����(type parameter)
	
	private T material;
	
	//getter
	public T getMaterial() {
		return material;
	}
	
	//setter
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString method override
	@Override
	public String toString() {
			
		return material.toString();
	}
	
	
	
	
	
}
