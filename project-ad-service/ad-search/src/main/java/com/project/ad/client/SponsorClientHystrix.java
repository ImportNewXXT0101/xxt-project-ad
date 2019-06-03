package com.project.ad.client;

import com.project.ad.client.vo.AdPlan;
import com.project.ad.client.vo.AdPlanGetRequest;
import com.project.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 断路器
 * @Author: ChengChuanQiang
 * @Date: 2019/5/6 22:49
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {
        return new CommonResponse<>(-1, "eureka-client-sponsor error");
    }
}
