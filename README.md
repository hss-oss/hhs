介绍
==============
1. 基于[sensitive-word](https://github.com/houbb/sensitive-word) 实现敏感词高亮
2. 前端采用wangEdit 富文本
   ![image](https://github.com/user-attachments/assets/f91e2230-017c-4461-aae5-524fe6de83a6)

API
===
WordController 中包含对应的 api 方法，后续可以添加验签等校验。

接口列表
----

| api | 入参 | 出参 | 说明 |
| :-- | :-- | :-- | :-- |
| /word/sensitive | NoteContent | CommonResult | 敏感词高亮 |
| /word/reload_dictionary | string | `List<String>` | 重新加载敏感词词库 |
