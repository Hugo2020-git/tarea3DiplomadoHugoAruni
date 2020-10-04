package apiClient;

/**
 * @autor : eynar.pari
 * @date : 03/10/2020.
 **/
public class FactoryRequest {

    public static IRequest make (String type){
        IRequest request;
        switch (type.toLowerCase()){

            case "get":
                request=new RequestGET();
                break;

            case "post":
                request=new RequestPOST();
                break;

            default:
                request=new RequestGET();
                break;

        }
        return request;
    }
}

