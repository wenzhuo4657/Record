package cn.wenzhuo4657.dailyWeb.domain.ItemEdit;


import cn.wenzhuo4657.dailyWeb.domain.ItemEdit.model.dto.UpdateCheckListDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface PlanService {


    /**
     * 更新title
     */
    public boolean CheckList(UpdateCheckListDto params);

    /**
     * 更新状态为完成(彻底完成，无论是PLan_I、还是Plan_II)
     */
    public boolean CheckListFinish(Long  id);


    /**
     * 标记当日完成
     * 如果是PLan_I，则是彻底完成
     * 如果是Plan_II,则是当天记录完成
     */
    public boolean CheckListToday(Long  id);


}
