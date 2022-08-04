import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//東北地方の県一覧を作成
		List<String> tohoku_regions = List.of ("aomori", "iwate", "akita", "miyagi", "yamagata","fukushima");
		
		//東北地方の県一覧で特定の要素”m”を含んでいるものを判定して出力
		List<String> result = tohoku_regions.stream().filter(region -> region.contains("m")).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("");
		
		//東北地方の県一覧で指定した文字列”a”で始まる文字列を判定し、その数字を出力
		long count = tohoku_regions.stream().filter(region -> region.startsWith("a")).count();
		System.out.println(count);
		System.out.println("");
		
		//東北地方の県一覧を小文字から大文字に出力
		tohoku_regions.stream().map(region -> region.toUpperCase()).forEach(region -> System.out.println(region));
		System.out.println("");
		
		//東北地方の県一覧で文字列”miyagi”が一致するかどうかを判定し、trueかfalseを出力
		boolean Miyagi = tohoku_regions.stream().anyMatch(region -> region.equals("miyagi"));
		System.out.println(Miyagi);
	}
} 
