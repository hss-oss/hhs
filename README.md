API
===
ApiSensitiveWordController 中包含对应的 api 方法，后续可以添加验签等校验。

接口列表
----

| api | 入参 | 出参 | 说明 |
| :-- | :-- | :-- | :-- |
| /word/sensitive | NoteContent | CommonResult | 敏感词高亮 |
| /word/reload_dictionary | string | `List<String>` | 重新加载敏感词词库 |
