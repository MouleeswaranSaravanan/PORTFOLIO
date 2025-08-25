import java.util.*;
public class Main
{
    public static List<List<Integer>> subsets(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        generatesubs(0,nums,new ArrayList<>(),result);
        return result;
        
    }
    private static void generatesubs(int idx,int nums[],List<Integer> current,List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        
        generatesubs(idx+1,nums,current,result);
        
        
        current.add(nums[idx]);
        generatesubs(idx+1,nums,current,result);
        current.remove(current.size()-1);
        
        
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");/?
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums [] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = subsets(nums);
        for(List<Integer> li: res){
            int sum = 0;
            for(int i : li) sum +=i;
            ans.add(sum);
}
Collections.sort(ans);
System.out.print(ans.get(ans.size()-1) - ans.get(0));
	}
}