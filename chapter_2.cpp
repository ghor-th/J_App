/*
 * chapter_2.cpp
 *
 *  Created on: 21 сент. 2013 г.
 *      Author: Lex
 */
///
#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

using namespace std;

/*1==int f_summ(int x, int y);
int f_summ(int x, int y){
	//int res = x+y;
	return (x+y);//res;
}
1--

2==
void f(int a){
	int m=0;
	cout<<"n m p\n";
	while(a--){
		static int n=0;
		int p=0;
		cout<<n++<<" "<<m++<<" "<<p++<<" \n";
	}
}
2--
*/
/*
void f_1(int i, int *j, int &adrs){
	i++;
	(*j)++;
	adrs++;
}
------------------------------------
int main(){
*/
/*
	int a=2, b=5, c, d;
	c=f_summ(a, b);
	cout << "f_summ(a,b)= " << f_summ(a,b)<<"\n";
	cin >> d;
	//cout << "f_summ(c,d)= " <<f_summ(c,d);
	return 0;
}

	f(3);
	f(2);
*/
	/*
	int i=1, j=2, k=3;
	cout <<"i j k\n";
	cout << i<<" "<< j <<" "<< k<<"\n";
	f_1(i, &j, k);
	cout << i<<" "<< j <<" "<< k<<"\n";
*/

//--------------------------
//rabora s so strokami

/*
int main(){
/*
	char s[]="2,4,6.5,,7,8, M", *ukz=s;
	double m[10];
	int i=0;
	do{
		m[i++]= atof(ukz);
		if (i>9) break;
	}while(ukz = strchr(ukz, ','), ukz++);

	cout << "massiv s[]: ";
	for (int k=0; k<i; k++){
		cout<<m[k]<<"; ";
	}
	//cout <<"\n__TIME__ : \""<<__TIME__;//<<__FILE__<<"\"";
	return 0;
}//end main
*/

