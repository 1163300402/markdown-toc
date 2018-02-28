package com.github.houbb.markdown.toc.util;

/**
 * String 工具类
 * @author bbhou
 * @since 1.0.0
 * @version 1.0.0
 */
public final class StringUtil {

    /**
     * 对于首字母如果是
     * @param tocTitle toc 标题
     * @return 对应的连接
     */
    public static String getTocHref(final String tocTitle) {
        if(isEmpty(tocTitle)) {
            return tocTitle;
        }

        if (tocTitle.length() == 1) {
            return tocTitle.toLowerCase();
        }
        String subEmptyHandle = tocTitle.substring(1).replace(' ', '-');    //GITHUB 对于空格处理
        return tocTitle.substring(0, 1).toLowerCase() + subEmptyHandle;
    }

    /**
     * 是否为空
     * @param string 字符串
     * @return {@code true} 是
     */
    public static boolean isEmpty(final String string) {
        return null == string
                || string.equals("");
    }

    /**
     * 根据任意多的空格进行分割字符串。
     * 1. 入参为空,则返回空字符串数组
     *
     * @param string 字符串
     * @return 割字符串数组
     */
    public static String[] splitByAnyBlank(final String string) {
        if (StringUtil.isEmpty(string)) {
            return new String[0];
        }

        final String pattern = "\\s+";
        return string.split(pattern);
    }

}
