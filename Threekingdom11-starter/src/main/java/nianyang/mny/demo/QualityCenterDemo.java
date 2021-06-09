package nianyang.mny.demo;

import com.taobao.quality.domain.OssSignatureDTO;
import com.taobao.quality.result.ResultDO;
import com.taobao.quality.service.OssClientService;
/**
 * @author sikou
 * @date 2021/02/23
 */
public class QualityCenterDemo {

    public static void main(String[] args) {

        OssClientService ossClientService=null;
        ResultDO<OssSignatureDTO> resultDO= ossClientService.generateSignature("");
        resultDO.getModule().getAccessKey();


    }
}
