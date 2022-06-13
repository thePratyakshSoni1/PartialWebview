package com.example.partialwebview

const val scriptForIds = "var targetIds=[\"dotcom-mpu\",\"dotcom-native\",\"footer-content\",\"header-content\",\"sticky-leaderboard\"]\n" +
        "    function hideIds(arrOfIdName){\n" +
        "\n" +
        "        for(var i=0;i<arrOfIdName.length;i++){\n" +
        "            var currentTarget = document.getElementById(arrOfIdName[i])\n" +
        "            if(currentTarget != null){\n" +
        "                currentTarget.style.display = 'none';\n" +
        "                }\n" +
        "            }\n" +
        "    \n" +
        "    }" +
        "hideIds(targetIds);" +
        ""

const val scriptForClasses = " var targetClasses = [\"ssrcss-1kczfdm-AsideWrapper\",\"ssrcss-1ydmugk-StyledTagContainer\",\"ssrcss-xa24e7-TagShareWrapper\",\"ssrcss-msolhr-LinksWrapper\",\"ssrcss-1kczfdm-AsideWrapper e1ia0oo96\",\"ssrcss-1wctgia-Stack\"];\n" +
        "    function hideClasses(arrOfClassesName){\n" +
        "        for(var i=0;i<arrOfClassesName.length;i++){\n" +
        "            var currentTargetClass = document.getElementsByClassName(arrOfClassesName[i]);\n" +
        "            for(var j=0;j<currentTargetClass.length;j++){\n" +
        "                currentTargetClass[j].style.display = 'none';\n" +
        "            }\n" +
        "        }\n" +
        "\n" +
        "    }" +
        "hideClasses(targetClasses);" +
        ""