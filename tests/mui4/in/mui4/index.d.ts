import * as React from 'react';

export type ButtonBaseClassKey = 'root' | 'disabled' | 'focusVisible';

export interface ButtonBaseTypeMap<P = {}, D extends React.ElementType = 'button'> {
    props: P & { centerRipple?: boolean; };
    defaultComponent: D;
    classKey: ButtonBaseClassKey;
}

export interface OverridableTypeMap {
    props: {};
    defaultComponent: React.ElementType;
    classKey: string;
}

export interface ExtendButtonBaseTypeMap<M extends OverridableTypeMap> {
    props: M['props'] & ButtonBaseTypeMap['props'];
    defaultComponent: M['defaultComponent'];
    classKey: M['classKey'];
}

export type ClassNameMap<ClassKey extends string = string> = Record<ClassKey, string>;

export interface StyledComponentProps<ClassKey extends string = string> {
    classes?: Partial<ClassNameMap<ClassKey>>;
    innerRef?: React.Ref<any>;
}

export interface CommonProps<M extends OverridableTypeMap> extends StyledComponentProps<M['classKey']> {
    className?: string;
    style?: React.CSSProperties;
}

export type BaseProps<M extends OverridableTypeMap> = & M['props'] & CommonProps<M>;

export type OverrideProps< M extends OverridableTypeMap, C extends React.ElementType > = ( & BaseProps<M> & Omit<React.ComponentPropsWithRef<C>, keyof CommonProps<M>> );

export type DefaultComponentProps<M extends OverridableTypeMap> =
    & BaseProps<M>
    & Omit<React.ComponentPropsWithRef<M['defaultComponent']>, keyof BaseProps<M>>;

export interface OverridableComponent<M extends OverridableTypeMap> {
    <C extends React.ElementType>( props: { component: C; } & OverrideProps<M, C> ): JSX.Element;
    (props: DefaultComponentProps<M>): JSX.Element;
}

export type ExtendButtonBase<M extends OverridableTypeMap> = (( props: { href: string } & OverrideProps<ExtendButtonBaseTypeMap<M>, 'a'> ) => JSX.Element) &
    OverridableComponent<ExtendButtonBaseTypeMap<M>>;

export const ButtonBase: ExtendButtonBase<ButtonBaseTypeMap>;
