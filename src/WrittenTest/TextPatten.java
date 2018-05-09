package WrittenTest;

/**
 * @param
 * @Author: 董能宇
 * @Email:dongnengyu@gmail.com
 * @Description:
 *
 * 1.序列模式匹配问题，给定一个输入文本text，和一个待匹配文本pattern，要求在text文本中匹配到的pattern的最短字符串，
 * 匹配结果可不连续，例如输入text为:abaacxbcbbbacc，pattern为cbc，则匹配为：abaacxbcbbbbacc。
 * 要求输出结果为在text中所匹配的起始位置。
 *
 * 例如，输入为：abaacxbcbbbacc  cbc 则输出为：4 7
 *
 *            输入为：aaabcac ac    则输出为:5 6
 *
 *  遇到匹配不到的情况，如：abc x  则输出为:-1 -1
 *
 * @Date: 2018/5/10
 *
 * 位置：/Users/xiaomu/Documents/ideaProject/data-structure/src/WrittenTest/TextPatten.java
 */


public class TextPatten {



    public static void main(String[] args) {
        String text = "aaabcac";
        String pattern = "ac";

        char[] textArray=text.toCharArray();

        char[] patternArray = pattern.toCharArray();

        int j = 0 ;

        first:for (int i = 0 ; i < patternArray.length ; i++){
            //System.out.println(textArray[i]);
            second:for (j = j ; j < textArray.length ; j++){
                if (patternArray[i] == textArray[j]){
                    System.out.println(patternArray[i]);
                    System.out.println(j);
                    break second;
                }
            }

        }



    }

}
