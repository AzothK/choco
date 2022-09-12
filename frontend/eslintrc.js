module.exports = {
  root: true,
  env: {
    browser: true,
    es6: true,
  },
  extends: [
    // import 관련 규칙 모음
    "plugin:prettier/recommended",
    // prettier 관련 규칙 모음
  ],
  parserOptions: {
    ecmaVersion: 2016,
    // 기준은 root 입니다.
  },
  rules: {
    // 추가하고 싶은 rule을 더 추가해줍니다.
  },
};

// 더 많은 규칙 설정은
// https://eslint.org/docs/latest/rules/
