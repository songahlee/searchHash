package searchHash;

public class SearchHash {
	
	public static void main(String[] args) {
				
		StringBuilder stringBuilder = new StringBuilder("{\n");
		stringBuilder.append("        \"prev_hash\":\"381b89e9ee66943f9511847cded6b45c4ffdf239852e7be09ab9d8e74eaf01be\",\n");
		stringBuilder.append("        \"height\":1,\n");
		stringBuilder.append("        \"msg\":\"Send To your resume, This Block hash first 8digit @yggdrash.io, example 46992daf@yggdrash.io\"\n");
		stringBuilder.append("    }");		
		
		String calculatedhash = MyStringUtil.applySha256(stringBuilder.toString());
		System.out.println(calculatedhash);

	}
}
