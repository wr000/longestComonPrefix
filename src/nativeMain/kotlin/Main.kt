
    fun longestCommonPrefix(strs: Array<String>): String {
        for (i in 0..strs.size-2) {
            while (!strs[i+1].isNullOrEmpty() && !strs[i].startsWith(strs[i+1]))
                strs[i+1] = strs[i+1].dropLast(1)
            println(strs.joinToString(" "))
        }
        return strs.last()
    }
    fun main()
    {
        println("Hello world")
        println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    }