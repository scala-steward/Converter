/// <reference no-default-lib="true"/>

interface ReadonlyArray<T> {}
interface HTMLAnchorElement {}
interface HTMLButtonElement {}

type Record<K extends keyof any, T> = {
    [P in K]: T;
};
type Pick<T, K extends keyof T> = {
    [P in K]: T[P];
};
type Exclude<T, U> = T extends U ? never : T;

type InstanceType<T extends new (...args: any) => any> = T extends new (...args: any) => infer R ? R : any;

type Partial<T> = {
    [P in keyof T]?: T[P];
};
type Omit<T, K extends keyof any> = Pick<T, Exclude<keyof T, K>>;
