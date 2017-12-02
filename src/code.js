function main() {
    var LOGIN_URL = "https://my.jcb.co.jp/Login";
    var userid = "myuserid";
    var password = "xxxxxxxx";

    var options = {
        method : "post",
        followRedirects: false,
        contentType: "application/x-www-form-urlencoded",
        payload : {
            userId: userid,
            password: password
        }
    };

//    var response = UrlFetchApp.fetch(LOGIN_URL, options);

//    Logger.log(response);

}
