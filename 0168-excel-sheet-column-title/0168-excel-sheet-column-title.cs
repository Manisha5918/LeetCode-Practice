using System.Text;
public class Solution
{
    public string ConvertToTitle(int columnNumber)
    {
         StringBuilder str=new StringBuilder();

         while(columnNumber>0){
            columnNumber--;

            int rem=columnNumber%26;

            char ch=(char)('A'+rem);

            str.Append(ch);

            columnNumber/=26;
         }
         char[] arr=str.ToString().ToCharArray();

         Array.Reverse(arr);

         return new String(arr);
    }
}