import java.util.*;
public class Course19110702 {
    public int count(int[] A, int n) {
        if (A == null || n == 0) {
            return 0;
        }
        return mergeSortRecursion(A, 0, n - 1);
    }

    public static int mergeSortRecursion(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = (l + r) / 2;
        //逆序对的总数=左边数组中的逆序对的数量+右边数组中逆序对的数量+左右结合成新的顺序数组时中出现的逆序对的数量；
        return mergeSortRecursion(arr, l, mid) + mergeSortRecursion(arr, mid + 1, r) +
                merge(arr, l, mid, r);
    }

    public static int merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int index = 0;
        int i = left;
        int j = mid + 1;
        int inverseNum = 0;// 新增，用来累加数组逆序对
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                // 当前一个数组元素大于后一个数组元素时，累加逆序对
                // s[i] > s[j] 推导出 s[i]...s[mid] > s[j]
                inverseNum += (mid - i + 1);
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left++] = temp[k];
        }
        return inverseNum;
    }
}

/*
public class InversePairs {
    private int count = 0;

    public int InversePairs(int[] a) {
        if (a == null || a.length == 0)
            return -1;
        mergeSort(a, 0, a.length - 1);
        return count;
    }

    public void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int t = right - left;//临时数组下标
        int l = mid;
        int r = right;
        while (l >= left && r >= mid + 1) {
            if (a[l] > a[r]) {
                count += (r - mid);
                tmp[t--] = a[l--];
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                tmp[t--] = a[r--];
            }
        }
        while (l >= left) {
            tmp[t--] = a[l--];
        }
        while (r >= mid + 1) {
            tmp[t--] = a[r--];
        }
        for (int i = 0; i <= right - left; i++) {
            a[left + i] = tmp[i];
        }
    }

    @Test
    public void testSolution() {
        int[] a = { 364, 637, 341, 406, 747, 995, 234, 971, 571, 219, 993, 407,
                416, 366, 315, 301, 601, 650, 418, 355, 460, 505, 360, 965,
                516, 648, 727, 667, 465, 849, 455, 181, 486, 149, 588, 233,
                144, 174, 557, 67, 746, 550, 474, 162, 268, 142, 463, 221, 882,
                576, 604, 739, 288, 569, 256, 936, 275, 401, 497, 82, 935, 983,
                583, 523, 697, 478, 147, 795, 380, 973, 958, 115, 773, 870,
                259, 655, 446, 863, 735, 784, 3, 671, 433, 630, 425, 930, 64,
                266, 235, 187, 284, 665, 874, 80, 45, 848, 38, 811, 267, 575 };
        System.out.println(InversePairs(a));//2519
    }
}
*/

/*
//暴力法
import java.util.*;

public class Course110702 {
    //暴力法
    public static int count(int[] A, int n) {
        if (A == null || n == 0) {
            return 0;
        }
        return num(A,n);
    }

    public static int num(int[] A,int n){
        int count=0;
        if(A==null || n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入 n 的值：");
        int n=input.nextInt();
        System.out.println("请输入数组A：");
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=input.nextInt();
        }
        System.out.println("请输入开始地址：");
        int p=input.nextInt();
        System.out.println("请输入结束地址：");
        int q=input.nextInt();
        System.out.println("逆序对个数："+count(A,n));
    }
}
*/