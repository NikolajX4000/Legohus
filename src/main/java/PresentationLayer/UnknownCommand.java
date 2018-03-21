package PresentationLayer;

import FunctionLayer.CustomException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UnknownCommand extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomException {
        String msg = "Unknown command. Contact IT";
        throw new CustomException(msg);
    }
}
