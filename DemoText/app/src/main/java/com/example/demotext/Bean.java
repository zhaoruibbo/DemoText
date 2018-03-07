package com.example.demotext;

import java.util.List;

/**
 * Created by 赵瑞波 on 2018/3/5.
 */

public class Bean {

    /**
     * error_code : 0
     * reason : 鎴愬姛鐨勮繑鍥�
     * result : {"data":[{"author_name":"鏂板崕鍥介檯澶存潯","category":"澶存潯","date":"2017-11-09 18:04","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","title":"淇勭綏鏂コ璁拌\u20ac呭弬鍔犳\u20ac荤粺閫変妇 闂圭潃鐜╄繕鏄潵鐪熺殑锛�","uniquekey":"685d0fccd3f5ea3014d7ab0215fecb5f","url":"http://mini.eastday.com/mobile/171109180455164.html"},{"author_name":"浜烘皯缃�","category":"澶存潯","date":"2017-11-09 18:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_0338994e5dcfa065d66d13cf701ccff3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171109/20171109174110_0c23c9c3a52033063a7af8c11880cf32_8_mwpm_03200403.jpg","title":"鎷ユ姳宀樻腐鐨勭ⅶ娴疯摑澶� ","uniquekey":"5f32d44a161e65acb4db3a90f41379d1","url":"http://mini.eastday.com/mobile/171109180324333.html"},{"author_name":"浜烘皯缃�","category":"澶存潯","date":"2017-11-09 17:55","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_4b706e469917a5184710455305391da5_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg","title":"瀛︿範璐交鍏氱殑鍗佷節澶х簿绁� 涓ぎ瀹ｈ鍥㈠璁叉姤鍛婁細鍦ㄩ儜涓捐","uniquekey":"2fe32f3da298fe335a3305ee53a30e39","url":"http://mini.eastday.com/mobile/171109175525809.html"}],"stat":"1"}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : [{"author_name":"鏂板崕鍥介檯澶存潯","category":"澶存潯","date":"2017-11-09 18:04","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","title":"淇勭綏鏂コ璁拌\u20ac呭弬鍔犳\u20ac荤粺閫変妇 闂圭潃鐜╄繕鏄潵鐪熺殑锛�","uniquekey":"685d0fccd3f5ea3014d7ab0215fecb5f","url":"http://mini.eastday.com/mobile/171109180455164.html"},{"author_name":"浜烘皯缃�","category":"澶存潯","date":"2017-11-09 18:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_0338994e5dcfa065d66d13cf701ccff3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171109/20171109174110_0c23c9c3a52033063a7af8c11880cf32_8_mwpm_03200403.jpg","title":"鎷ユ姳宀樻腐鐨勭ⅶ娴疯摑澶� ","uniquekey":"5f32d44a161e65acb4db3a90f41379d1","url":"http://mini.eastday.com/mobile/171109180324333.html"},{"author_name":"浜烘皯缃�","category":"澶存潯","date":"2017-11-09 17:55","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_4b706e469917a5184710455305391da5_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg","title":"瀛︿範璐交鍏氱殑鍗佷節澶х簿绁� 涓ぎ瀹ｈ鍥㈠璁叉姤鍛婁細鍦ㄩ儜涓捐","uniquekey":"2fe32f3da298fe335a3305ee53a30e39","url":"http://mini.eastday.com/mobile/171109175525809.html"}]
         * stat : 1
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * author_name : 鏂板崕鍥介檯澶存潯
             * category : 澶存潯
             * date : 2017-11-09 18:04
             * thumbnail_pic_s : http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg
             * title : 淇勭綏鏂コ璁拌€呭弬鍔犳€荤粺閫変妇 闂圭潃鐜╄繕鏄潵鐪熺殑锛�
             * uniquekey : 685d0fccd3f5ea3014d7ab0215fecb5f
             * url : http://mini.eastday.com/mobile/171109180455164.html
             * thumbnail_pic_s02 : http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://05.imgmini.eastday.com/mobile/20171109/20171109174110_0c23c9c3a52033063a7af8c11880cf32_8_mwpm_03200403.jpg
             */

            private String author_name;
            private String category;
            private String date;
            private String thumbnail_pic_s;
            private String title;
            private String uniquekey;
            private String url;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
