import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//tohoku regionsのリストを作成
		List<String> tohoku_regions = List.of ("aomori", "iwate", "akita", "miyagi", "yamagata","fukushima");
		
		//リストが特定の要素を含むかどうか判定して出力
		List<String> result = tohoku_regions.stream().filter(region -> region.contains("m")).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("");
		
		//指定した文字列の始まりの文字列を判定して出力
		long count = tohoku_regions.stream().filter(region -> region.startsWith("a")).count();
		System.out.println(count);
		System.out.println("");
		
		//小文字を大文字にして出力
		tohoku_regions.stream().map(region -> region.toUpperCase()).forEach(region -> System.out.println(region));
		System.out.println("");
		
		//文字列が一致するかどうかを判定して出力
		boolean Miyagi = tohoku_regions.stream().anyMatch(region -> region.equals("miyagi"));
		System.out.println(Miyagi);
	}
} 
