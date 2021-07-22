fun main() {
    print(lineEncoding("aabbbc"))
}
fun lineEncoding(s: String): String {
    var myString=""
    for(item in 0 until s.length){
        var count=0
        if(item>0)
            if(s[item]==s[item.minus(1)])
                continue
        for(item1 in item until s.length){
            if(s[item]==s[item1])
                count++
            if(count==1 && item1==s.length-1 ||count==1 && s[item1+1]!=s[item1]){
                myString+=s[item1].toString()
                break}
            else if(count>1 && item1 ==s.length-1 ||count>1 && s[item1]!=s[item1.plus(1)]){
                myString+=count.toString()+s[item1]
                break}
            else continue } }
    return myString
}